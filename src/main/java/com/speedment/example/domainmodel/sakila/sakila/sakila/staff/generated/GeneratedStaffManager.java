package com.speedment.example.domainmodel.sakila.sakila.sakila.staff.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.example.domainmodel.sakila.sakila.sakila.staff.Staff;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.speedment.example.domainmodel.sakila.sakila.sakila.staff.Staff} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedStaffManager extends Manager<Staff> {
    
    TableIdentifier<Staff> IDENTIFIER = TableIdentifier.of("sakila", "sakila", "staff");
    List<Field<Staff>> FIELDS = unmodifiableList(asList(
        Staff.STAFF_ID,
        Staff.FIRST_NAME,
        Staff.LAST_NAME,
        Staff.ADDRESS_ID,
        Staff.PICTURE,
        Staff.EMAIL,
        Staff.STORE_ID,
        Staff.ACTIVE,
        Staff.USERNAME,
        Staff.PASSWORD,
        Staff.LAST_UPDATE
    ));
    
    @Override
    default Class<Staff> getEntityClass() {
        return Staff.class;
    }
}