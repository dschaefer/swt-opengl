/*******************************************************************************
 * Copyright (c) 2010, Wind River Systems and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Wind River Systems - Initial API and implementation
 *******************************************************************************/

#include <GL/gl.h>
#include <GL/glu.h>
#include "glext.h"
#include "jni.h"

#define M(type, func, args...) \
	extern "C" JNIEXPORT type JNICALL Java_org_eclipse_swt_opengl_GLU_ \
		## func(JNIEnv * env, jclass cls, ## args)

M(void, gluLookAt, jdouble eyeX, jdouble eyeY, jdouble eyeZ, jdouble centerX, jdouble centerY, jdouble centerZ, jdouble upX, jdouble upY, double upZ) {
	gluLookAt(eyeX, eyeY, eyeZ, centerX, centerY, centerZ, upX, upY, upZ);
}

M(void, gluPerspective, jdouble fovy, jdouble aspect, jdouble zNear, jdouble zFar) {
	gluPerspective(fovy, aspect, zNear, zFar);
}
