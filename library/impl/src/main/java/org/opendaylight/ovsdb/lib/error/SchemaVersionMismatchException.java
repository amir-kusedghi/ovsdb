/*
 * Copyright (c) 2014, 2015 Red Hat, Inc. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.ovsdb.lib.error;

import com.google.common.collect.Range;
import org.opendaylight.ovsdb.lib.notation.Version;

/**
 * This exception is used when the a table or row is accessed though a typed interface
 * and the version requirements are not met.
 */
public class SchemaVersionMismatchException extends RuntimeException {
    private static final long serialVersionUID = -5194270510726950745L;

    public SchemaVersionMismatchException(final Version schemaVersion, final Range<Version> range) {
        super("The schema version used to access the table/column (" + schemaVersion + ") does not match the required"
                + " version range " + range);
    }
}
