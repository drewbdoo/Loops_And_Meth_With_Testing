import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageMethTest {

    @Test
    @DisplayName("Does all this add")
    void doesAllThisAddUp(){
        assertEquals(7, AverageMeth.sum(1,2,4));
    }

    @Test
    @DisplayName("Does this result in an average")
    void doesThisFailToAdd(){
        assertEquals(4, AverageMeth.average(1,3,8));}

    @Test
    @DisplayName("Does this not result in an average")
    void doeshisFailToAdd(){
        assertNotEquals(5, AverageMeth.average(1,3,8));}


}