<<<<<<< HEAD:voiceless_screaming/src/main/java/vs/lt/lt003_1/EditorController.java
package vs.lt.lt003_1;
=======
package vs.ma.ma_001_1.controller;
>>>>>>> cf6cb37ed2ecd52808e28eeb2a69c137aa1cd4ed:voiceless_screaming/src/main/java/vs/ma/ma_001_1/controller/EditorController.java

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/edit/*")
public class EditorController {

	@RequestMapping("/edit_page")
	public void edit() {
		log.info("edit--------------------");
	}
}
