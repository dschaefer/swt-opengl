package org.eclipse.swt.opengl.test;

import junit.framework.Assert;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.opengl.GL;
import org.eclipse.swt.opengl.GLCanvas;
import org.eclipse.swt.opengl.GLData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.Test;

public class LinkTest {

	@Test
	public void linkTest() {
		GL.glClearIndex(0);
	}
	
	@Test
	public void extTest() {
		Display display = new Display();
		Shell shell = new Shell(display, SWT.SHELL_TRIM | SWT.NO_BACKGROUND);
		GLData gldata = new GLData();
		gldata.doubleBuffer = true;
		GLCanvas glcanvas = new GLCanvas(shell, 0, gldata);
		glcanvas.setCurrent();
		GL.glBlendColor(0f, 0f, 0f, 0f);
		Assert.assertEquals(GL.glGetError(), GL.GL_NO_ERROR);
	}
}
