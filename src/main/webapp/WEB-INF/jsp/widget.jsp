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
					<div class="widget-message-text">
						<textarea class="widget-message-textarea"></textarea>
					</div>
					<div class="widget-message-btn">
						<button id="sendBtn" onclick=showMessage()>Send</button>
					</div>
				</div>
			</div>
		</div>

		<div class="widget-footer">
			<div class="widget-text-simple text-white">Widget Footer</div>
		</div>
	</div>
</div>

<div class="web-socket-controls">
	<button id="connect" onclick="connect();">Connect</button>
	<button id="disconnect" disabled="disabled" onclick="disconnect();">Disconnect</button>
</div>

<script src="/resources/js/messageHandler.js"></script>
<script src="/resources/js/sockjs-0.3.4.min.js"></script>
<script src="/resources/js/stomp.js"></script>