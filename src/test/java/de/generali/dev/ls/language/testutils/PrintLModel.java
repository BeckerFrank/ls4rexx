/**
 *  Copyright (c) 2020 Generali Deutschland AG - Team Informatik
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Markus Holzem <markus.holzem@generali.com>
 */
package de.generali.dev.ls.language.testutils;

import de.generali.dev.ls.language.LModel;
import de.generali.dev.ls.language.LParser;

/**
 * PrintLModel
 */
public class PrintLModel
{
	public static void main(final String[] arg)
	{
		if (arg.length == 0) {
			System.out.println("Usage: PrintLModel <filename>");
			System.exit(1);
		}
		final String filename = arg[0];
		final String content = TestResource.getContent(filename);
		final LModel lModel = LParser.INSTANCE.parse(filename, content, null);
		System.out.println(lModel);
	}
}
