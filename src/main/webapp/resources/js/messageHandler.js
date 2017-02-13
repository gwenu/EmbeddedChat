// TODO: move to the top level
var chatterEndpointURL = "/chatter/endpoint";
var messageEndpointURL = "/message";
var appMessageEndpointURL = "/app/message";
var chatroomEdpointURL = "/chatroom/register";

var stompClient = null;
var sender = null;
var receiver = null;

function setConnected(connected) {
	document.getElementById('connect').disabled = connected;
	document.getElementById('disconnect').disabled = !connected;
}

function connect() {
	var socket = new SockJS(messageEndpointURL);
	stompClient = Stomp.over(socket);
	stompClient.connect({}, function(frame) {
		setConnected(true);
		console.log('Connected: ' + frame);
		stompClient.subscribe(chatterEndpointURL, function(message) {
			showMessage(JSON.parse(message.body));
		});
	});

	registerActors();
}

function disconnect() {
	if (stompClient != null) {
		stompClient.disconnect();
	}
	setConnected(false);
	console.log("Disconnected!");
}

function sendMessage() {
	var message = $(".widget-message-textarea").val();
	stompClient.send(appMessageEndpointURL, {}, JSON.stringify({
		'sender' : sender,
		'receiver': receiver,
		'chatRoomId' : chatRoomId,
		'message' : message
	}));

	return message;
}

function showMessage(message) {
	var messageContainer = $(".widget-dialog-container");
	messageContainer.append(composeDialogItem(message));
}

function composeDialogItem(message) {
	return createDivWithClass("widget-dilog-name col-md-3 text-muted",
			"<strong>" + message.sender + "</strong></div>")
			+ createDivWithClass("widget-dilog-message col-md-9 text-muted",
					message.message);
}

function createDivWithClass(divClass, divContent) {
	return "<div class='" + divClass + "'>" + divContent + "</div>";
}

function registerActors() {
	sender = $(".sender").val()
	receiver = $(".receiver").val();
	chatRoomId = registerChatRoom();
}

function registerChatRoom() {
	return $.ajax({
		type : "POST",
		url : chatroomEdpointURL,
		data : {
			sender : $(".sender").val(),
			receiver : $(".receiver").val()
		},
		async : false
	}).responseText;
}
