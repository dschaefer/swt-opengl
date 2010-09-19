package org.eclipse.swt.opengl.test;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.opengl.GL;
import org.eclipse.swt.opengl.GLCanvas;
import org.eclipse.swt.opengl.GLData;
import org.eclipse.swt.opengl.GLU;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.Test;

public class DrawTest {

	@Test
	public void drawTest() throws InterruptedException {
		Display display = new Display();
		Shell shell = new Shell(display, SWT.SHELL_TRIM | SWT.NO_BACKGROUND);
		shell.setText("First polygon");
		shell.setLayout(new FillLayout());
		shell.setSize(640, 480);
		
		GLData gldata = new GLData();
		gldata.doubleBuffer = true;
		
		GLCanvas glcanvas = new GLCanvas(shell, 0, gldata);
		shell.open();
		glcanvas.setCurrent();
		resize();
		init();
		draw();
		glcanvas.swapBuffers();
		
		while (!shell.isDisposed ()) {
			if (!display.readAndDispatch ()) {
				display.sleep();
			}
		}
	}
	
	private void resize() {
		GL.glViewport(0, 0, 640, 480);
		GL.glMatrixMode(GL.GL_PROJECTION);
		GL.glLoadIdentity();
		double aspect = 640.0 / 480.0;
		GLU.gluPerspective(45.0, aspect, 0.5, 400.0);
		GL.glMatrixMode(GL.GL_MODELVIEW);
		GL.glLoadIdentity();
	}
	
	private void init() {
		GL.glShadeModel(GL.GL_SMOOTH);
		GL.glClearColor(0f, 0f, 0f, 0f);
		GL.glClearDepth(1.0);
		GL.glEnable(GL.GL_DEPTH_TEST);
		GL.glDepthFunc(GL.GL_LEQUAL);
		GL.glHint(GL.GL_PERSPECTIVE_CORRECTION_HINT, GL.GL_NICEST);
	}
	
	private void draw() {
		GL.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
		GL.glLoadIdentity();
		GL.glTranslatef(-1.5f, 0f, -6.0f);
		
		GL.glBegin(GL.GL_TRIANGLES);
		GL.glVertex3f(0f, 1f, 0f);
		GL.glVertex3f(-1f, -1f, 0f);
		GL.glVertex3f(1f, -1f, 0f);
		GL.glEnd();
		
		GL.glTranslatef(3.0f, 0f, 0f);
		GL.glBegin(GL.GL_QUADS);
		GL.glVertex3f(-1f, 1f, 0f);
		GL.glVertex3f(1f, 1f, 0f);
		GL.glVertex3f(1f, -1f, 0f);
		GL.glVertex3f(-1f, -1f, 0f);
		GL.glEnd();
	}
}
