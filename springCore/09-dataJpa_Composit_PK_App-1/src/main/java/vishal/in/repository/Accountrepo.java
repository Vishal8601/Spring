package vishal.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vishal.in.entity.Account;
import vishal.in.entity.AccountPk;

public interface Accountrepo extends JpaRepository<Account, AccountPk>{

}
