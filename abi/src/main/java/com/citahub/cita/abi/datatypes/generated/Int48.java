package com.citahub.cita.abi.datatypes.generated;

import java.math.BigInteger;
import com.citahub.cita.abi.datatypes.Int;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use com.citahub.cita.codegen.AbiTypesGenerator in the
 */
public class Int48 extends Int {
    public static final Int48 DEFAULT = new Int48(BigInteger.ZERO);

    public Int48(BigInteger value) {
        super(48, value);
    }

    public Int48(long value) {
        this(BigInteger.valueOf(value));
    }
}
