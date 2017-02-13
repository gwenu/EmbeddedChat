(function() {
	var jQuery;
	var jQueryVersion = "1.4.2";
	var jQueryUrl = "http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js";
	
	if (window.jQuery === undefined || window.jQuery.fn.jquery !== jQueryVersion) {
	    var script_tag = createScriptTag(jQueryUrl);
	   
	    if (script_tag.readyState) {
	    	scriptLoadHandlerForOldIE();
	    } else { 
	      // Other browsers
	      script_tag.onload = scriptLoadHandler;
	    }
	    (document.getElementsByTagName("head")[0] || document.documentElement).appendChild(script_tag);
	} else {
	    // The jQuery version on the window is the one we want to use
	    jQuery = window.jQuery;
	    main();
	    
	    console.log("!!!!!!");
	};
	
	function createScriptTag(source) {
		var script_tag = document.createElement("script");
	    script_tag.setAttribute("type","text/javascript");
	    script_tag.setAttribute("src", source);
	    
	    return script_tag;
	};
	
	function scriptLoadHandler() {
	    // Restore $ and window.jQuery to their previous values and store the
	    // new jQuery in our local jQuery variable
	    jQuery = window.jQuery.noConflict(true);
	    main(); 
	};
	
	function scriptLoadHandlerForOldIE() {
		 script_tag.onreadystatechange = function () { // For old versions of IE
	          if (this.readyState == "complete" || this.readyState == "loaded") {
	              scriptLoadHandler();
	          }
	      };
	};
	
	/* Main function */
	function main() { 
	    jQuery(document).ready(function($) { 
	    	
	    	$.ajax({
	    		  method: "GET",
	    		  url: "/widget/init", 
	    		  success: function(response) { 
	    		  	  $("#widgetWrapper").append(response);
	    	      }
	    	});
		 });
	 };
})();