package org.okboom.yuumi.sequence.active;


import org.apache.commons.lang3.RandomUtils;
import org.okboom.yuumi.sequence.Sequence;
import org.okboom.yuumi.sequence.exception.SeqException;
import org.okboom.yuumi.tool.extension.annotation.Extension;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author tookbra
 */
@Extension("default")
public class DefaultSequence implements Sequence {

    private final static AtomicInteger sequenceId = new AtomicInteger(RandomUtils.nextInt());

    @Override
    public long nextId() throws SeqException {
        return sequenceId.incrementAndGet();
    }

    @Override
    public String formatNextId() throws SeqException {
        return String.valueOf(nextId());
    }
}
