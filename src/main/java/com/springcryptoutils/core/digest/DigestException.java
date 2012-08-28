/*
 * Copyright 2012 Mirko Caserta
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this software except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.springcryptoutils.core.digest;

/**
 * Exception class for wrapping checked exceptions into runtime exceptions.
 *
 * @author Mirko Caserta (mirko.caserta@gmail.com)
 */
public class DigestException extends RuntimeException {

    /**
     * Creates a new exception.
     *
     * @param message the message
     * @param cause   the root cause
     */
    public DigestException(String message, Throwable cause) {
        super(message, cause);
    }

}