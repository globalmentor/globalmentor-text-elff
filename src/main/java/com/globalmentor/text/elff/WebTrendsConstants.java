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
 * WebTrends-specific logging information.
 * @author Garret Wilson
 */
public class WebTrendsConstants {

	/** The name of the WebTrends ID cookie. */
	public static final String WEBTRENDS_ID_COOKIE_NAME = "WEBTRENDS_ID";

	/** The namespace for WebTrends query parameters. */
	public static final String WEBTRENDS_QUERY_NAMESPACE = "WT";

	/** The delimiter seprating the namespace from the query type and attribute local name. */
	public static final char QUERY_NAMESPACE_SEPARATOR = '.';

	/** The attribute signifying the client's hour. */
	public static final String BROWSING_HOUR_QUERY_ATTRIBUTE_NAME = createQueryAttributeName(WEBTRENDS_QUERY_NAMESPACE, "bh");

	/** The attribute signifying the browser size. */
	public static final String BROWSER_SIZE_QUERY_ATTRIBUTE_NAME = createQueryAttributeName(WEBTRENDS_QUERY_NAMESPACE, "bs");

	/** The attribute signifying the client's color depth. */
	public static final String COLOR_DEPTH_QUERY_ATTRIBUTE_NAME = createQueryAttributeName(WEBTRENDS_QUERY_NAMESPACE, "cd");

	/** The attribute signifying one or more content groups. */
	public static final String CONTENT_GROUP_NAME_QUERY_ATTRIBUTE_NAME = createQueryAttributeName(WEBTRENDS_QUERY_NAMESPACE, "cg_n");

	/** The attribute signifying one or more content subgroups. */
	public static final String CONTENT_SUBGROUP_NAME_QUERY_ATTRIBUTE_NAME = createQueryAttributeName(WEBTRENDS_QUERY_NAMESPACE, "cg_s");

	/** The attribute signifying whether the client has Java enabled. */
	public static final String JAVA_ENABLED_QUERY_ATTRIBUTE_NAME = createQueryAttributeName(WEBTRENDS_QUERY_NAMESPACE, "jo");

	/** The attribute signifying whether JavaScript is supported; supports "Yes" or "No". */
	public static final String JAVASCRIPT_QUERY_ATTRIBUTE_NAME = createQueryAttributeName(WEBTRENDS_QUERY_NAMESPACE, "js");

	/** The attribute signifying the version of JavaScript. */
	public static final String JAVASCRIPT_VERSION_QUERY_ATTRIBUTE_NAME = createQueryAttributeName(WEBTRENDS_QUERY_NAMESPACE, "jv");

	/** The attribute signifying the client's screen resolution. */
	public static final String SCREEN_RESOLUTION_QUERY_ATTRIBUTE_NAME = createQueryAttributeName(WEBTRENDS_QUERY_NAMESPACE, "sr");

	/** The attribute signifying the content title. */
	public static final String TITLE_QUERY_ATTRIBUTE_NAME = createQueryAttributeName(WEBTRENDS_QUERY_NAMESPACE, "ti");

	/** The attribute signifying the client's time zone offset from GMT. */
	public static final String TIMEZONE_QUERY_ATTRIBUTE_NAME = createQueryAttributeName(WEBTRENDS_QUERY_NAMESPACE, "tz");

	/** The attribute signifying the client's language. */
	public static final String USER_LANGUAGE_QUERY_ATTRIBUTE_NAME = createQueryAttributeName(WEBTRENDS_QUERY_NAMESPACE, "ul");

	/**
	 * Creates a WebTrends query attribute name from a namespace and attribute local name.
	 * @param namespace The attribute namespace.
	 * @param attributeLocalName The local name of the attribute.
	 * @return An attribute name composed of the given namespace and local name.
	 */
	public static String createQueryAttributeName(final String namespace, final String attributeLocalName) {
		return namespace + QUERY_NAMESPACE_SEPARATOR + attributeLocalName; //namespace.attributeLocalName
	}
}
