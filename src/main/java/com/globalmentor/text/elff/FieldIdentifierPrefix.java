/*
 * Copyright © 1996-2008 GlobalMentor, Inc. <http://www.globalmentor.com/>
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
 */

package com.globalmentor.text.elff;

import static java.util.Objects.*;

/**
 * The prefix of a field identifier of an individual field in an entry of the Extended Log File Format (ELFF).
 * @author Garret Wilson
 * @see <a href="file:///D:/reference/W3C/ELFF/WD-logfile.html">W3C Extended Log File Format</a>
 */
public enum FieldIdentifierPrefix {

	/** Client information. */
	CLIENT("c"),
	/** Server information. */
	SERVER("s"),
	/** Remote information. */
	REMOTE("r"),
	/** Client-to-server information. */
	CLIENT_SERVER("cs"),
	/** Server-to-client information. */
	SERVER_CLIENT("sc"),
	/** Server-to-remote server information. */
	SERVER_REMOTE_SERVER("sr"),
	/** Remote-server-to-server information. */
	REMOTE_SERVER_SERVER("rs"),
	/** WebTrends DCS prefix. */
	DCS("dcs"),
	/** Application-specific information. */
	APPLICATION_SPECIFIC("x");

	/** The literal ID character sequence used to format this prefix. */
	private final String id;

	/** @return The literal ID character sequence used to format this prefix. */
	public String getID() {
		return id;
	}

	/**
	 * Prefix ID constructor.
	 * @param id The literal ID character sequence used to format this prefix.
	 * @throws NullPointerException if the given ID is <code>null</code>.
	 */
	private FieldIdentifierPrefix(final String id) {
		this.id = requireNonNull(id, "ID cannot be null."); //save the ID
	}
}