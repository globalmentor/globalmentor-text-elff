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

/**
 * The type of an individual field in an entry of the Extended Log File Format (ELFF).
 * @author Garret Wilson
 * @see <a href="file:///D:/reference/W3C/ELFF/WD-logfile.html">W3C Extended Log File Format</a>
 */
public enum FieldType {

	/** An Internet address and port. */
	ADDRESS,
	/** The data in GMT in the format <code>YYYY-MM-DD</code>. */
	DATE,
	/** A fixed format float. */
	FIXED,
	/** A sequence of digits. */
	INTEGER,
	/** A sequence of characters surrounded by the quote ('"') character, with that literal character escaped by doubling. */
	STRING,
	/** The time in GMT in the format <code>HH:MM</code>, <code>HH:MM:SS</code> or <code>HH:MM:SS.S</code>. */
	TIME,
	/** An absolute or relative URI. */
	URI;
}
