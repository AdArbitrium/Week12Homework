import edu.gcccd.csis.GenericQueue;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenericQueueTest {

        private GenericQueue<Integer> genericQueue1 = new GenericQueue<>();
        private GenericQueue<String> genericQueue2 = new GenericQueue<>();

        @Before
        public void setUp(){
            genericQueue1.enqueue(1);
            genericQueue1.enqueue(2);
            genericQueue1.enqueue(3);
            genericQueue1.enqueue(22);
            genericQueue1.enqueue(4);
            genericQueue1.enqueue(8);
            genericQueue1.enqueue(20);
            genericQueue1.enqueue(0);
            genericQueue1.enqueue(68684);
            genericQueue1.enqueue(98);
        }

        @Test
        public void capacityOfQueue(){
            assertEquals(10, genericQueue1.length());
            assertEquals(0, genericQueue2.length());

        }

        @Test
        public void enqueue()  {

            genericQueue1.enqueue(null);
            genericQueue1.enqueue(70);
            assertEquals(10, genericQueue1.length());

            genericQueue2.enqueue("the length");
            genericQueue2.enqueue("should equal 2");
            assertEquals(2, genericQueue2.length());
        }


        @Test
        public void dequeue() {

            assertEquals(1, (int)genericQueue1.dequeue());
            assertEquals(9, genericQueue1.length());
            assertEquals(2, (int)genericQueue1.dequeue());
            assertEquals(8, genericQueue1.length());

            assertNull(genericQueue2.dequeue());

        }
    }

