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

#define BUFF(type, name) (type *)env->GetDirectBufferAddress(name)

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
	glPolygonStipple(BUFF(GLubyte, mask));
}

M(void, glGetPolygonStipple, jobject mask) {
	glGetPolygonStipple(BUFF(GLubyte, mask));
}

M(void, glEdgeFlag, jboolean flag) {
	glEdgeFlag(flag);
}

M(void, glEdgeFlagv, jobject flag) {
	glEdgeFlagv(BUFF(GLboolean, flag));
}

M(void, glScissor, jint x, jint y, jint width, jint height) {
	glScissor(x, y, width, height);
}

M(void, glClipPlane, jint plane, jobject equation) {
	glClipPlane(plane, BUFF(GLdouble, equation));
}

M(void, glGetClipPlane, jint plane, jobject equation) {
	glGetClipPlane(plane, BUFF(GLdouble, equation));
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
	glGetBooleanv(pname, BUFF(GLboolean, params));
}

M(void, glGetDoublev, jint pname, jobject params) {
	glGetDoublev(pname, BUFF(GLdouble, params));
}

M(void, glGetFloatv, jint pname, jobject params) {
	glGetFloatv(pname, BUFF(GLfloat, params));
}

M(void, glGetIntegerv, jint pname, jobject params) {
	glGetIntegerv(pname, BUFF(GLint, params));
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

M(void, glClearDepth, jdouble depth) {
	glClearDepth(depth);
}

M(void, glDepthFunc, jint func) {
	glDepthFunc(func);
}

M(void, glDepthMask, jboolean flag) {
	glDepthMask(flag);
}

M(void, glDepthRange, jdouble near_val, jdouble far_val) {
	glDepthRange(near_val, far_val);
}

M(void, glClearAccum, jfloat red, jfloat green, jfloat blue, jfloat alpha) {
	glClearAccum(red, green, blue, alpha);
}

M(void, glAccum, int op, jfloat value) {
	glAccum(op, value);
}

M(void, glMatrixMode, jint mode) {
	glMatrixMode(mode);
}

M(void, glOrtho, jdouble left, jdouble right, jdouble bottom, jdouble top, jdouble near_val, jdouble far_val) {
	glOrtho(left, right, bottom, top, near_val, far_val);
}

M(void, glFrustum, jdouble left, jdouble right, jdouble bottom, jdouble top, jdouble near_val, jdouble far_val) {
	glFrustum(left, right, bottom, top, near_val, far_val);
}

M(void, glViewport, jint x, jint y, jint width, jint height) {
	glViewport(x, y, width, height);
}

M(void, glPushMatrix) {
	glPushMatrix();
}

M(void, glPopMatrix) {
	glPopMatrix();
}

M(void, glLoadIdentity) {
	glLoadIdentity();
}

M(void, glLoadMatrixd, jobject m) {
	glLoadMatrixd(BUFF(GLdouble, m));
}

M(void, glLoadMatrixf, jobject m) {
	glLoadMatrixf(BUFF(GLfloat, m));
}

M(void, glMultMatrixd, jobject m) {
	glMultMatrixd(BUFF(GLdouble, m));
}

M(void, glMultMatrixf, jobject m) {
	glMultMatrixf(BUFF(GLfloat, m));
}

M(void, glRotated, jdouble angle, jdouble x, jdouble y, jdouble z) {
	glRotated(angle, x, y, z);
}

M(void, glRotatef, jfloat angle, jfloat x, jfloat y, jfloat z) {
	glRotatef(angle, x, y, z);
}

M(void, glScaled, jdouble x, jdouble y, jdouble z) {
	glScaled(x, y, z);
}

M(void, glScalef, jfloat x, jfloat y, jfloat z) {
	glScalef(x, y, z);
}

M(void, glTranslated, jdouble x, jdouble y, jdouble z) {
	glTranslated(x, y, z);
}

M(void, glTranslatef, jfloat x, jfloat y, jfloat z) {
	glTranslatef(x, y, z);
}

M(jboolean, glIsList, jint list) {
	return glIsList(list) ? JNI_TRUE : JNI_FALSE;
}

M(void, glDeleteLists, jint list, jint range) {
	glDeleteLists(list, range);
}

M(jint, glGenLists, jint range) {
	return glGenLists(range);
}

M(void, glNewList, jint list, jint mode) {
	glNewList(list, mode);
}

M(void, glEndList) {
	glEndList();
}

M(void, glCallList, jint list) {
	glCallList(list);
}

M(void, glCallLists, jint n, jint type, jobject lists) {
	glCallLists(n, type, BUFF(GLvoid, lists));
}

M(void, glListBase, jint base) {
	glListBase(base);
}
