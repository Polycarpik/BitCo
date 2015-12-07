package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;


@RestController
public class KeyGeneratorController {
    @RequestMapping("/generatePrivateKey")
    public KeyGenerator generate(@RequestParam(value="masterKey") String masterKey, @RequestParam(value = "chainCode") String chainCode) {
        return new KeyGenerator(masterKey,chainCode);
    }
}
