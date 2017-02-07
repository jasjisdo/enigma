/*******************************************************************************
 * Copyright (c) 2015 Jeff Martin.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public
 * License v3.0 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 * 
 * Contributors:
 *     Jeff Martin - initial API and implementation
 ******************************************************************************/
package cuchaz.enigma.gui;

import java.awt.Component;

import javassist.bytecode.Descriptor;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class ClassListCellRenderer implements ListCellRenderer<String> {
	
	private DefaultListCellRenderer m_defaultRenderer;
	
	public ClassListCellRenderer() {
		m_defaultRenderer = new DefaultListCellRenderer();
	}
	
	@Override
	public Component getListCellRendererComponent(JList<? extends String> list, String className, int index, boolean isSelected, boolean hasFocus) {
		JLabel label = (JLabel)m_defaultRenderer.getListCellRendererComponent(list, className, index, isSelected, hasFocus);
		label.setText(Descriptor.toJavaName(className));
		return label;
	}
}
