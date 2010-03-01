/*
 * Copyright 2010 Shikhar Bhushan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This file may incorporate work covered by the following copyright and
 * permission notice:
 *
 *     Licensed to the Apache Software Foundation (ASF) under one
 *     or more contributor license agreements.  See the NOTICE file
 *     distributed with this work for additional information
 *     regarding copyright ownership.  The ASF licenses this file
 *     to you under the Apache License, Version 2.0 (the
 *     "License"); you may not use this file except in compliance
 *     with the License.  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *      Unless required by applicable law or agreed to in writing,
 *      software distributed under the License is distributed on an
 *      "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *      KIND, either express or implied.  See the License for the
 *      specific language governing permissions and limitations
 *      under the License.
 */
package net.schmizz.sshj.transport;

import net.schmizz.concurrent.ExceptionChainer;
import net.schmizz.sshj.common.DisconnectReason;
import net.schmizz.sshj.common.SSHException;

/** Transport-layer exception */
public class TransportException
        extends SSHException {

    /** @see {@link net.schmizz.concurrent.ExceptionChainer} */
    public static final ExceptionChainer<TransportException> chainer = new ExceptionChainer<TransportException>() {
        public TransportException chain(Throwable t) {
            if (t instanceof TransportException)
                return (TransportException) t;
            else
                return new TransportException(t);
        }
    };

    public TransportException() {
        super();
    }

    public TransportException(DisconnectReason code) {
        super(code);
    }

    public TransportException(DisconnectReason code, String message) {
        super(code, message);
    }

    public TransportException(DisconnectReason code, String message, Throwable cause) {
        super(code, message, cause);
    }

    public TransportException(DisconnectReason code, Throwable cause) {
        super(code, cause);
    }

    public TransportException(String message) {
        super(message);
    }

    public TransportException(String message, Throwable cause) {
        super(message, cause);
    }

    public TransportException(Throwable cause) {
        super(cause);
    }

}