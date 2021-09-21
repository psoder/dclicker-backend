package counter;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
// @CrossOrigin(origins = "https://ddagen.se/clicker")
public class CounterController {

	private Counter counter = new Counter();

	@GetMapping("/counter")
	public Counter counter() {
		return counter;
	}

	@PostMapping("/counter/update")
	public void updateCount(@RequestBody String change) {
		counter.updateCount(Integer.parseInt(change.substring(7, change.length() - 1)));
	}

	@PutMapping("/counter/reset")
	public void resetCount(@RequestBody String newVal) {
		try {
			counter.setCount(Integer.parseInt(newVal.substring(7, newVal.length() - 1)));
		} catch (Exception e) {
		}
	}
}
