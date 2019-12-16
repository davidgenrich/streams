package com.speedment.example.domainmodel.sakila.sakila.sakila.customer_list.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.example.domainmodel.sakila.sakila.sakila.customer_list.CustomerList;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.speedment.example.domainmodel.sakila.sakila.sakila.customer_list.CustomerList}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedCustomerListManager extends Manager<CustomerList> {
    
    TableIdentifier<CustomerList> IDENTIFIER = TableIdentifier.of("sakila", "sakila", "customer_list");
    List<Field<CustomerList>> FIELDS = unmodifiableList(asList(
        CustomerList.ID,
        CustomerList.NAME,
        CustomerList.ADDRESS,
        CustomerList.ZIP_CODE,
        CustomerList.PHONE,
        CustomerList.CITY,
        CustomerList.COUNTRY,
        CustomerList.NOTES,
        CustomerList.SID
    ));
    
    @Override
    default Class<CustomerList> getEntityClass() {
        return CustomerList.class;
    }
}