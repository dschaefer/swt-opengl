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
#include "glext.h"
#include "jni.h"

extern "C"
JNIEXPORT void JNICALL Java_org_eclipse_swt_opengl_GL_glClearIndex(JNIEnv * env, jclass cls, jfloat c) {
	glClearIndex(c);
}
