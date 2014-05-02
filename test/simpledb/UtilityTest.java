package simpledb;

import org.junit.Test;
import simpledb.systemtest.SystemTestUtil;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class UtilityTest {
    /**
     * Unit test for getTypes()
     */
    @Test public void getTypes(){
        int len = 1;
        assertEquals(Type.INT_TYPE,Utility.getTypes(len)[0]);
    }

    /**
     * Unit Test for openHeapFile()
     */
    @Test public void openHeapFile() throws Exception {
        HeapFile other = SystemTestUtil.createRandomHeapFile(5, 5, null, null);
        assertNotSame(other, Utility.openHeapFile(5, other.getFile()));
    }
}

