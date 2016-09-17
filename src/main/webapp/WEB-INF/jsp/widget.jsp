<div class="widget-container">
	<div class="widget-left-panel"></div>
	<div class="widget-right-panel">
		<div class="widget-header">
			<div class="widget-text-simple text-white">Widget Header</div>
		</div>

		<div class="widget-content">
			<div class="widget-content-wrapper">
				<div class="widget-dialog-container"></div>
				<div class="widget-message-container">
					<div class="widget-message-text has-success">
						<textarea class="widget-message-textarea form-control" rows="2"></textarea>
					</div>
					<div class="widget-message-btn">
						<button type="button" id="sendBtn" class="btn btn-success" onclick=sendMessage()>Send</button>
					</div>
				</div>
			</div>
		</div>

		<div class="widget-footer">
			<div class="widget-text-simple text-white">Widget Footer</div>
		</div>
	</div>
</div>

<div class="web-socket-tmp-container">
	<div class="web-socket-dialog-actors">
		<label for="sender">Sender</label>
		<input type="text" class="sender form-control">
		
		<label for="receiver">Receiver</label>	
		<input type="text" class="receiver form-control">
	</div>
	<div class="web-socket-controls">
		<button id="connect" onclick="connect();">Connect</button>
		<button id="disconnect" disabled="disabled" onclick="disconnect();">Disconnect</button>
	</div>
</div>

<script src="/resources/js/messageHandler.js"></script>
<script src="/resources/js/sockjs-0.3.4.min.js"></script>
<script src="/resources/js/stomp.js"></script>