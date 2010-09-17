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

M(void, glEdgeFlag, jboolean flag) {
	glEdgeFlag(flag);
}

M(void, glEdgeFlagv, jobject flag) {
	GLboolean * cflag = (GLboolean *)env->GetDirectBufferAddress(flag);
	glEdgeFlagv(cflag);
}

M(void, glScissor, jint x, jint y, jint width, jint height) {
	glScissor(x, y, width, height);
}

M(void, glClipPlane, jint plane, jobject equation) {
	const GLdouble * cequation = (GLdouble *)env->GetDirectBufferAddress(equation);
	glClipPlane(plane, cequation);
}

M(void, glGetClipPlane, jint plane, jobject equation) {
	GLdouble * cequation = (GLdouble *)env->GetDirectBufferAddress(equation);
	glGetClipPlane(plane, cequation);
}

M(void, glDrawBuffer, jint mode) {
	glDrawBuffer(mode);
}

M(void, glReadBuffer, jint mode) {
	glReadBuffer(mode);
}

M(void, glEnable, jint cap) {
	glEnable(cap);
}

M(void, glDisable, jint cap) {
	glDisable(cap);
}

M(jboolean, glIsEnabled, jint cap) {
	return glIsEnabled(cap) ? JNI_TRUE : JNI_FALSE;
}

M(void, glEnableClientState, jint cap) {
	glEnableClientState(cap);
}

M(void, glDisableClientState, jint cap) {
	glDisableClientState(cap);
}

M(void, glGetBooleanv, jint pname, jobject params) {
	GLboolean * cparams = (GLboolean *)env->GetDirectBufferAddress(params);
	glGetBooleanv(pname, cparams);
}

M(void, glGetDoublev, jint pname, jobject params) {
	GLdouble * cparams = (GLdouble *)env->GetDirectBufferAddress(params);
	glGetDoublev(pname, cparams);
}

M(void, glGetFloatv, jint pname, jobject params) {
	GLfloat * cparams = (GLfloat *)env->GetDirectBufferAddress(params);
	glGetFloatv(pname, cparams);
}

M(void, glGetIntegerv, jint pname, jobject params) {
	GLint * cparams = (GLint *)env->GetDirectBufferAddress(params);
	glGetIntegerv(pname, cparams);
}

M(void, glPushAttrib, jint mask) {
	glPushAttrib(mask);
}

M(void, glPopAttrib) {
	glPopAttrib();
}

M(void, glPushClientAttrib, jint mask) {
	glPushClientAttrib(mask);
}

M(void, glPopClientAttrib) {
	glPopClientAttrib();
}

M(jint, glRenderMode, jint mode) {
	return glRenderMode(mode);
}

M(jint, glGetError) {
	return glGetError();
}

M(jstring, glGetString, jint name) {
	const GLubyte * namechars = glGetString(name);
	return env->NewStringUTF((const char *)namechars);
}

M(void, glFinish) {
	glFinish();
}

M(void, glFlush) {
	glFlush();
}

M(void, glHint, jint target, jint mode) {
	glHint(target, mode);
}
