/*
 * Copyright © 1996-2008 GlobalMentor, Inc. <https://www.globalmentor.com/>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.globalmentor.text.elff;

import static java.util.Objects.*;

/**
 * A field identifier of an individual field in an entry of the Extended Log File Format (ELFF).
 * @author Garret Wilson
 * @see <a href="file:///D:/reference/W3C/ELFF/WD-logfile.html">W3C Extended Log File Format</a>
 */
public class FieldIdentifier {

	/** The identifier prefix, or <code>null</code> if there is no prefix. */
	private final FieldIdentifierPrefix prefix;

	/** @return The identifier prefix, or <code>null</code> if there is no prefix. */
	public FieldIdentifierPrefix getPrefix() {
		return prefix;
	}

	/** Identifier of information transferred between parties defined by the value prefix, or of an HTTP header if this field identifier represents a header. */
	private final String identifier;

	/**
	 * @return Identifier of information transferred between parties defined by the value prefix, or of an HTTP header if this field identifier represents a
	 *         header.
	 */
	public String getIdentifier() {
		return identifier;
	}

	/** <code>true</code> if the identifier represents an HTTP header, else <code>false</code> for normal identifiers. */
	private final boolean isHeader;

	/** @return <code>true</code> if the identifier represents an HTTP header, else <code>false</code> for normal identifiers. */
	public boolean isHeader() {
		return isHeader;
	}

	/**
	 * Identifier constructor with no prefix.
	 * @param identifier Identifier of information transferred between parties defined by the value prefix.
	 * @throws NullPointerException if the given identifier is <code>null</code>.
	 */
	public FieldIdentifier(final String identifier) {
		this(identifier, false); //construct the field identifier specifying that it is not a header
	}

	/**
	 * Identifier/header constructor with no prefix.
	 * @param identifier Identifier of information transferred between parties defined by the value prefix, or of an HTTP header if this field identifier
	 *          represents a header.
	 * @param isHeader <code>true</code> if the identifier represents an HTTP header, else <code>false</code> for normal identifiers.
	 * @throws NullPointerException if the given identifier is <code>null</code>.
	 */
	public FieldIdentifier(final String identifier, final boolean isHeader) {
		this(null, identifier, isHeader); //construct the field identifier with no prefix
	}

	/**
	 * Prefix and identifier constructor.
	 * @param prefix The identifier prefix, or <code>null</code> if there is no prefix.
	 * @param identifier Identifier of information transferred between parties defined by the value prefix.
	 * @throws NullPointerException if the given identifier is <code>null</code>.
	 */
	public FieldIdentifier(final FieldIdentifierPrefix prefix, final String identifier) {
		this(prefix, identifier, false); //construct the field identifier specifying that it is not a header
	}

	/**
	 * Prefix and identifier/header constructor.
	 * @param prefix The identifier prefix, or <code>null</code> if there is no prefix.
	 * @param identifier Identifier of information transferred between parties defined by the value prefix, or of an HTTP header if this field identifier
	 *          represents a header.
	 * @param isHeader <code>true</code> if the identifier represents an HTTP header, else <code>false</code> for normal identifiers.
	 * @throws NullPointerException if the given identifier is <code>null</code>.
	 */
	public FieldIdentifier(final FieldIdentifierPrefix prefix, final String identifier, final boolean isHeader) {
		this.prefix = prefix;
		this.identifier = requireNonNull(identifier, "Identifier cannot be null.");
		this.isHeader = isHeader;
	}
}
