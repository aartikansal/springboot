import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {
    private final AccountService repo;

    public AccountController(AccountService repo) {
        this.repo = repo;
    }

    @GetMapping("/accounts")
    public List<Account> getAllAccounts(){
        return repo.getAllAccounts();
    }

    @GetMapping("/accounts/{id}")
    public Account getAccount(@PathVariable Long id){
        return repo.getAccountByID(id);
    }

}
