package org.hibernate.test.annotations.derivedidentities.e3.b3;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class EmployeeId implements Serializable {
	String firstName;
	String lastName;
}
