// we need to import testing and assertequal and this file also needs access to the test class
//
// hover over RED text, press ALT+ENTER and import the one that has ORG within addreess

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear;
    @Before
    public void before(){
        bear = new Bear("Baloo", 25,95.62);
    }

   @Test
   public void hasName(){
//       Bear bear= new Bear("Baloo",25);
       assertEquals("Baloo", bear.getName());
   }

   @Test
    public void hasAge(){
//       Bear bear = new Bear("baloo",25);
       assertEquals(25, bear.getAge());
   }


   @Test
    public void hasWeight(){
//       Bear bear = new Bear("Balo",25, 95.62);
       assertEquals(95.62, bear.getWeight(), 0.01); // when using doubles we need to use a 3rd value in assert equal
   }

   @Test
    public void readyToHibernateIfGreaterThan80(){
        assertEquals(true, bear.readyToHibernate());
   }

   @Test
    public void notReadyToHibernateIfWeithgLessThan80(){
        Bear thinBear = new Bear("Baloo", 25, 65.44);
        assertEquals(false, thinBear.readyToHibernate());
   }
}
