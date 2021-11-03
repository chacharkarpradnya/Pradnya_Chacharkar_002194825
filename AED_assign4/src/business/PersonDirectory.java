package business;

import java.util.ArrayList;

/**
 *
 * @author pradnya
 */
public class PersonDirectory {
    
    private ArrayList<Person> personsDirectory;
    
    public PersonDirectory() {
        personsDirectory = new ArrayList<>();
    }
    
    public ArrayList<Person> getPersonHistory() {
        return personsDirectory;
    }
    
    public void setPersonHistory(ArrayList<Person> personHistory) {
        this.personsDirectory = personHistory;
    }
    
    public Person createAndAddPerson() {
        Person person = new Person();
        personsDirectory.add(person);
        return person;
    }
    
    public void deletePerson(Person person) {
        personsDirectory.remove(person);
    }
    
    public ArrayList<Person> searchPatient(String key)
    {
        ArrayList<Person> searchPatientDirectory = new ArrayList();
        for(Person person: personsDirectory)
        {
            if(person.getPersonsName().toLowerCase().startsWith(key.toLowerCase()))
            {
                if(person.getPatient()!=null)
                {
                    searchPatientDirectory.add(person);
                }
            }
        }
        return searchPatientDirectory;
    }
    
    public ArrayList<Person> searchPerson(String key)
    {
        ArrayList<Person> searchPersonDirectory = new ArrayList();
        for(Person person: personsDirectory)
        {
            if(person.getPersonsName().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPersonDirectory.add(person);
            }
        }
        return searchPersonDirectory;
    }
}