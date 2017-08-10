package com.realdolmen.candyshop.domain;

import com.realdolmen.candyshop.AbstractPersistenceTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.management.Query;

// TODO: use the AbstractPersistence Test
public class PersonPersistenceTest extends AbstractPersistenceTest {
    // TODO: add unit test personCanBePersisted()
	@Test
	public void personCanBePersisted() throws Exception
	{
		Person p =new Person();
		p.setFirstName("Amin");
		p.setLastName("Sajedi");
		em.persist(p);
		assertNotNull(p.getId());
	}
    // TODO: add unit test personCanBeLoaded()
    @Test
    public void personCanBeLoaded() throws Exception {
        Person person = em.find(Person.class, 1000);
        assertEquals("Amin", person.getFirstName());
        assertEquals("Sajedi", person.getLastName());
      
    }
}
