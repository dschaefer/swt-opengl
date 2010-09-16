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

#define M(type, func, args...) \
	extern "C" JNIEXPORT type JNICALL Java_org_eclipse_swt_opengl_GL_ \
		## func(JNIEnv * env, jclass cls, ## args)

M(void, glClearIndex, jfloat c) {
	glClearIndex(c);
}

M(void, glClearColor, jfloat red, jfloat green, jfloat blue, jfloat alpha) {
	glClearColor(red, green, blue, alpha);
}

M(void, glClear, jint mask) {
	glClear(mask);
}

M(void, glIndexMask, jint mask) {
	glIndexMask(mask);
}

M(void, glColorMask, jboolean red, jboolean green, jboolean blue, jboolean alpha) {
	glColorMask(red, green, blue, alpha);
}

M(void, glAlphaFunc, jint func, jfloat ref) {
	glAlphaFunc(func, ref);
}

M(void, glBlendFunc, jint sfactor, jint dfactor) {
	glBlendFunc(sfactor, dfactor);
}

M(void, glLogicOp, jint opcode) {
	glLogicOp(opcode);
}

M(void, glCullFace, jint mode) {
	glCullFace(mode);
}

M(void, glFrontFace, jint mode) {
	glFrontFace(mode);
}

M(void, glPointSize, jfloat size) {
	glPointSize(size);
}

M(void, glLineWidth, jfloat width) {
	glLineWidth(width);
}

M(void, glLineStipple, jint factor, jshort pattern) {
	glLineStipple(factor, pattern);
}

M(void, glPolygonMode, jint face, jint mode) {
	glPolygonMode(face, mode);
}

M(void, glPolygonOffset, jfloat factor, jfloat units) {
	glPolygonOffset(factor, units);
}

M(void, glPolygonStipple, jobject mask) {
	const GLubyte * cmask = (GLubyte *)env->GetDirectBufferAddress(mask);
	glPolygonStipple(cmask);
}

M(void, glGetPolygonStipple, jobject mask) {
	GLubyte * cmask = (GLubyte *)env->GetDirectBufferAddress(mask);
	glGetPolygonStipple(cmask);
}
