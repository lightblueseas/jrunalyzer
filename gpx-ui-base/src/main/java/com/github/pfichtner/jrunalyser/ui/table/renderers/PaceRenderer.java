package com.github.pfichtner.jrunalyser.ui.table.renderers;

import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import com.github.pfichtner.jrunalyser.ui.base.StaticSettings;
import com.github.pfichtner.jrunalyser.ui.format.PaceFormatter;

public class PaceRenderer extends DefaultTableCellRenderer {
	private static final long serialVersionUID = 1L;
	private final PaceFormatter formatter = new PaceFormatter(
			PaceFormatter.Type.SHORT);

	@Override
	public Component getTableCellRendererComponent(JTable table,
			Object value, boolean isSelected, boolean hasFocus, int row,
			int column) {
		setFont(null);
		setText(this.formatter.format(StaticSettings.INSTANCE, value));
		setBackground(isSelected ? table.getSelectionBackground() : null);
		return this;
	}

}