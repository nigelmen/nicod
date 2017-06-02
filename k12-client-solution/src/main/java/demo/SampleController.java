package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@Value("${ACCESS.UI.URL}") String accessUI;
	
	@Value("${LRNX.URL}") String lrnxURL;

	@RequestMapping("/access-ui")
	public String getAccessUIURL() {
		return "The access ui URL is: " + accessUI;
	}
	
	@RequestMapping("/lrnx-url")
	public String getLMSURL() {
		return " The lrnx url is: " + lrnxURL;
	}
	
}
