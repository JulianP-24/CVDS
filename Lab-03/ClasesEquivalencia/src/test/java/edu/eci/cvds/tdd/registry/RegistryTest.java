package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateInvalidAge(){
       Person persona = new Person();
       persona.setAge(-22);
       persona.setAlive(true);
       RegisterResult result = registry.registerVoter(persona);
       Assert.assertEquals(RegisterResult.INVALID_AGE, result);

   }
   @Test
    public void validateIsAlive(){
        Person persona = new Person();
        persona.setAlive(true);
        RegisterResult result = registry.registerVoter(persona);
        Assert.assertTrue(persona.isAlive());
    }

   @Test
    public void validateDead(){
       Person persona = new Person();
       persona.setAlive(false);
       RegisterResult result = registry.registerVoter(persona);
       Assert.assertEquals(RegisterResult.DEAD, result);
   }

   @Test
    public void validateDuplicateId(){
       Person personaOne = new Person();
       personaOne.setId(1233911890);
       personaOne.setAlive(true);
       registry.registerVoter(personaOne);
       Person personaTwo = new Person();
       personaTwo.setId(1233911890);
       personaTwo.setAlive(true);
       RegisterResult result = registry.registerVoter(personaTwo);
       Assert.assertEquals(RegisterResult.DUPLICATED, result);
   }

   @Test
    public void validateValidRegister(){
       Person persona = new Person();
       persona.setAge(20);
       persona.setAlive(true);

       RegisterResult result = registry.registerVoter(persona);
       Assert.assertEquals(RegisterResult.VALID, result);
   }

   @Test
    public void validateUnderage(){
       Person persona = new Person();
       persona.setAge(12);
       persona.setAlive(true);
       RegisterResult result = registry.registerVoter(persona);
       Assert.assertEquals(RegisterResult.UNDERAGE, result);
   }
    // TODO Complete with more test cases
}
