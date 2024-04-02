package com.etiyacrm.customerservice.business.rules;

import com.etiyacrm.customerservice.core.exceptions.types.BusinessException;
import com.etiyacrm.customerservice.dataAccess.abstracts.IndividualCustomerRepository;
import com.etiyacrm.customerservice.entities.IndividualCustomer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class IndividualCustomerBusinessRules {
    private IndividualCustomerRepository individualCustomerRepository;

    public void nationalityIdentityCannotBeDuplicated(String natioanlityIdentity){
        Optional<IndividualCustomer> individualCustomer = individualCustomerRepository
                .findByNationalityIdentityIgnoreCase(natioanlityIdentity);
        if (individualCustomer.isPresent()){
            throw new BusinessException("A customer is already exist with this Nationality ID");
        }

    }

}
