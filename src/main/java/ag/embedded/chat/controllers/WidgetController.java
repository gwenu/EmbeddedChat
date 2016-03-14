package ag.embedded.chat.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WidgetController {
	
	private static final String WIDGET_VIEW = "widget";
	
	@RequestMapping("/widget/init")
	public ModelAndView initWidget() {
		ModelAndView model = new ModelAndView();
    	model.setViewName(WIDGET_VIEW);
    	
		return model;
	}

}
