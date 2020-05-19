package org.okboom.yuumi.sequence;

import org.junit.Test;
import org.okboom.yuumi.sequence.active.DefaultSequence;

/**
 * @author tookbra
 */
public class SnowflakeSequenceTest {

    @Test
    public void testGetSeq() {
        Sequence sequence = new DefaultSequence();
        System.out.println(sequence.nextId());
    }
}
