var stompClient = null;

function setConnected(connected) {
    document.getElementById('connect').disabled = connected;
    document.getElementById('disconnect').disabled = !connected;
}

function connect() {
    var socket = new SockJS('/message');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function(frame) {
        setConnected(true);
        console.log('Connected: ' + frame);
        stompClient.subscribe('/chat/endpoint', function(message){
        	sendMessage(JSON.parse(message.body).content);
        });
    });
}

function disconnect() {
    if (stompClient != null) {
        stompClient.disconnect();
    }
    setConnected(false);
    console.log("Disconnected");
}

function sendMessage() {
	var message = $(".widget-message-textarea").val();
	stompClient.send("/app/message", {}, JSON.stringify({ 'name': 'default', 'message': message }));
	
	return message;
}


function showMessage() {
	var message = sendMessage();
	var messageContainer = $(".widget-dialog-container");

	$(".widget-dialog-container").append("<div class='widget-dilog-name col-md-3 text-muted'><strong>Name:</strong></div> " +
			"<div class='widget-dilog-message col-md-9 text-muted'>" + message + "</div");
}
