/*
 * Copyright (c) 2014, 2015 Red Hat, Inc. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.ovsdb.lib.error;

/**
 * This exception is thrown when a result does not meet any of the known formats in RFC7047.
 */
public class UnexpectedResultException extends RuntimeException {
    private static final long serialVersionUID = 7440870601052355685L;

    public UnexpectedResultException(final String message) {
        super(message);
    }

    public UnexpectedResultException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
