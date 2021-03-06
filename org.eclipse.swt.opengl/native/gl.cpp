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

GLenum swtGLError;

void swtGLNotImplemented() {
	swtGLError = GL_INVALID_OPERATION;
}

M(jint, glGetError) {
	if (swtGLError != GL_NO_ERROR)
		return swtGLError;
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

M(void, glBegin, jint mode) {
	glBegin(mode);
}

M(void, glEnd) {
	glEnd();
}

M(void, glVertex2d, jdouble x, jdouble y) {
	glVertex2d(x, y);
}

M(void, glVertex2f, jfloat x, jfloat y) {
	glVertex2f(x, y);
}

M(void, glVertex2i, jint x, jint y) {
	glVertex2i(x, y);
}

M(void, glVertex2s, jshort x, jshort y) {
	glVertex2s(x, y);
}

M(void, glVertex3d, jdouble x, jdouble y, jdouble z) {
	glVertex3d(x, y, z);
}

M(void, glVertex3f, jfloat x, jfloat y, jfloat z) {
	glVertex3f(x, y, z);
}

M(void, glVertex3i, jint x, jint y, jint z) {
	glVertex3i(x, y, z);
}

M(void, glVertex3s, jshort x, jshort y, jshort z) {
	glVertex3s(x, y, z);
}

M(void, glVertex4d, jdouble x, jdouble y, jdouble z, jdouble w) {
	glVertex4d(x, y, z, w);
}

M(void, glVertex4f, jfloat x, jfloat y, jfloat z, jfloat w) {
	glVertex4f(x, y, z, w);
}

M(void, glVertex4i, jint x, jint y, jint z, jint w) {
	glVertex4i(x, y, z, w);
}

M(void, glVertex4s, jshort x, jshort y, jshort z, jshort w) {
	glVertex4s(x, y, z, w);
}

M(void, glVertex2dv, jobject v) {
	glVertex2dv(BUFF(GLdouble, v));
}

M(void, glVertex2fv, jobject v) {
	glVertex2fv(BUFF(GLfloat, v));
}

M(void, glVertex2iv, jobject v) {
	glVertex2iv(BUFF(GLint, v));
}

M(void, glVertex2sv, jobject v) {
	glVertex2sv(BUFF(GLshort, v));
}

M(void, glVertex3dv, jobject v) {
	glVertex3dv(BUFF(GLdouble, v));
}

M(void, glVertex3fv, jobject v) {
	glVertex3fv(BUFF(GLfloat, v));
}

M(void, glVertex3iv, jobject v) {
	glVertex3iv(BUFF(GLint, v));
}

M(void, glVertex3sv, jobject v) {
	glVertex3sv(BUFF(GLshort, v));
}

M(void, glVertex4dv, jobject v) {
	glVertex4dv(BUFF(GLdouble, v));
}

M(void, glVertex4fv, jobject v) {
	glVertex4fv(BUFF(GLfloat, v));
}

M(void, glVertex4iv, jobject v) {
	glVertex4iv(BUFF(GLint, v));
}

M(void, glVertex4sv, jobject v) {
	glVertex4sv(BUFF(GLshort, v));
}

M(void, glNormal3b, jbyte nx, jbyte ny, jbyte nz) {
	glNormal3b(nx, ny, nz);
}

M(void, glNormal3d, jdouble nx, jdouble ny, jdouble nz) {
	glNormal3d(nx, ny, nz);
}

M(void, glNormal3f, jfloat nx, jfloat ny, jfloat nz) {
	glNormal3f(nx, ny, nz);
}

M(void, glNormal3i, jint nx, jint ny, jint nz) {
	glNormal3i(nx, ny, nz);
}

M(void, glNormal3s, jshort nx, jshort ny, jshort nz) {
	glNormal3s(nx, ny, nz);
}

M(void, glNormal3bv, jobject v) {
	glNormal3bv(BUFF(GLbyte, v));
}

M(void, glNormal3dv, jobject v) {
	glNormal3dv(BUFF(GLdouble, v));
}

M(void, glNormal3fv, jobject v) {
	glNormal3fv(BUFF(GLfloat, v));
}

M(void, glNormal3iv, jobject v) {
	glNormal3iv(BUFF(GLint, v));
}

M(void, glNormal3sv, jobject v) {
	glNormal3sv(BUFF(GLshort, v));
}

M(void, glIndexd, jdouble c) {
	glIndexd(c);
}

M(void, glIndexf, jfloat c) {
	glIndexf(c);
}

M(void, glIndexi, jint c) {
	glIndexi(c);
}

M(void, glIndexs, jshort c) {
	glIndexs(c);
}

M(void, glIndexub, jbyte c) {
	glIndexub(c);
}

M(void, glIndexdv, jobject c) {
	glIndexdv(BUFF(GLdouble, c));
}

M(void, glIndexfv, jobject c) {
	glIndexfv(BUFF(GLfloat, c));
}

M(void, glIndexiv, jobject c) {
	glIndexiv(BUFF(GLint, c));
}

M(void, glIndexsv, jobject c) {
	glIndexsv(BUFF(GLshort, c));
}

M(void, glIndexubv, jobject c) {
	glIndexubv(BUFF(GLubyte, c));
}

M(void, glColor3b, jbyte red, jbyte green, jbyte blue) {
	glColor3b(red, green, blue);
}

M(void, glColor3d, jdouble red, jdouble green, jdouble blue) {
	glColor3d(red, green, blue);
}

M(void, glColor3f, jfloat red, jfloat green, jfloat blue) {
	glColor3f(red, green, blue);
}

M(void, glColor3i, jint red, jint green, jint blue) {
	glColor3i(red, green, blue);
}

M(void, glColor3s, jshort red, jshort green, jshort blue) {
	glColor3s(red, green, blue);
}

M(void, glColor3ub, jbyte red, jbyte green, jbyte blue) {
	glColor3ub(red, green, blue);
}

M(void, glColor3ui, jint red, jint green, jint blue) {
	glColor3ui(red, green, blue);
}

M(void, glColor3us, jshort red, jshort green, jshort blue) {
	glColor3us(red, green, blue);
}

M(void, glColor4b, jbyte red, jbyte green, jbyte blue, jbyte alpha) {
	glColor4b(red, green, blue, alpha);
}

M(void, glColor4d, jdouble red, jdouble green, jdouble blue, jdouble alpha) {
	glColor4d(red, green, blue, alpha);
}

M(void, glColor4f, jfloat red, jfloat green, jfloat blue, jfloat alpha) {
	glColor4f(red, green, blue, alpha);
}

M(void, glColor4i, jint red, jint green, jint blue, jint alpha) {
	glColor4i(red, green, blue, alpha);
}

M(void, glColor4s, jshort red, jshort green, jshort blue, jshort alpha) {
	glColor4s(red, green, blue, alpha);
}

M(void, glColor4ub, jbyte red, jbyte green, jbyte blue, jbyte alpha) {
	glColor4ub(red, green, blue, alpha);
}

M(void, glColor4ui, jint red, jint green, jint blue, jint alpha) {
	glColor4ui(red, green, blue, alpha);
}

M(void, glColor4us, jshort red, jshort green, jshort blue, jshort alpha) {
	glColor4us(red, green, blue, alpha);
}

M(void, glColor3bv, jobject v) {
	glColor3bv(BUFF(GLbyte, v));
}

M(void, glColor3dv, jobject v) {
	glColor3dv(BUFF(GLdouble, v));
}

M(void, glColor3fv, jobject v) {
	glColor3fv(BUFF(GLfloat, v));
}

M(void, glColor3iv, jobject v) {
	glColor3iv(BUFF(GLint, v));
}

M(void, glColor3sv, jobject v) {
	glColor3sv(BUFF(GLshort, v));
}

M(void, glColor3ubv, jobject v) {
	glColor3ubv(BUFF(GLubyte, v));
}

M(void, glColor3uiv, jobject v) {
	glColor3uiv(BUFF(GLuint, v));
}

M(void, glColor3usv, jobject v) {
	glColor3usv(BUFF(GLushort, v));
}

M(void, glColor4bv, jobject v) {
	glColor4bv(BUFF(GLbyte, v));
}

M(void, glColor4dv, jobject v) {
	glColor4dv(BUFF(GLdouble, v));
}

M(void, glColor4fv, jobject v) {
	glColor4fv(BUFF(GLfloat, v));
}

M(void, glColor4iv, jobject v) {
	glColor4iv(BUFF(GLint, v));
}

M(void, glColor4sv, jobject v) {
	glColor4sv(BUFF(GLshort, v));
}

M(void, glColor4ubv, jobject v) {
	glColor4ubv(BUFF(GLubyte, v));
}

M(void, glColor4uiv, jobject v) {
	glColor4uiv(BUFF(GLuint, v));
}

M(void, glColor4usv, jobject v) {
	glColor4usv(BUFF(GLushort, v));
}

M(void, glTexCoord1d, jdouble s) {
	glTexCoord1d(s);
}

M(void, glTexCoord1f, jfloat s) {
	glTexCoord1f(s);
}

M(void, glTexCoord1i, jint s) {
	glTexCoord1i(s);
}

M(void, glTexCoord1s, jshort s) {
	glTexCoord1s(s);
}

M(void, glTexCoord2d, jdouble s, jdouble t) {
	glTexCoord2d(s, t);
}

M(void, glTexCoord2f, jfloat s, jfloat t) {
	glTexCoord2f(s, t);
}

M(void, glTexCoord2i, jint s, jint t) {
	glTexCoord2i(s, t);
}

M(void, glTexCoord2s, jshort s, jshort t) {
	glTexCoord2s(s, t);
}

M(void, glTexCoord3d, jdouble s, jdouble t, jdouble r) {
	glTexCoord3d(s, t, r);
}

M(void, glTexCoord3f, jfloat s, jfloat t, jfloat r) {
	glTexCoord3f(s, t, r);
}

M(void, glTexCoord3i, jint s, jint t, jint r) {
	glTexCoord3i(s, t, r);
}

M(void, glTexCoord3s, jshort s, jshort t, jshort r) {
	glTexCoord3s(s, t, r);
}

M(void, glTexCoord4d, jdouble s, jdouble t, jdouble r, jdouble q) {
	glTexCoord4d(s, t, r, q);
}

M(void, glTexCoord4f, jfloat s, jfloat t, jfloat r, jfloat q) {
	glTexCoord4d(s, t, r, q);
}

M(void, glTexCoord4i, jint s, jint t, jint r, jint q) {
	glTexCoord4i(s, t, r, q);
}

M(void, glTexCoord4s, jshort s, jshort t, jshort r, jshort q) {
	glTexCoord4s(s, t, r, q);
}

M(void, glTexCoord1dv, jobject v) {
	glTexCoord1dv(BUFF(GLdouble, v));
}

M(void, glTexCoord1fv, jobject v) {
	glTexCoord1fv(BUFF(GLfloat, v));
}

M(void, glTexCoord1iv, jobject v) {
	glTexCoord1iv(BUFF(GLint, v));
}

M(void, glTexCoord1sv, jobject v) {
	glTexCoord1sv(BUFF(GLshort, v));
}

M(void, glTexCoord2dv, jobject v) {
	glTexCoord2dv(BUFF(GLdouble, v));
}

M(void, glTexCoord2fv, jobject v) {
	glTexCoord2fv(BUFF(GLfloat, v));
}

M(void, glTexCoord2iv, jobject v) {
	glTexCoord2iv(BUFF(GLint, v));
}

M(void, glTexCoord2sv, jobject v) {
	glTexCoord2sv(BUFF(GLshort, v));
}

M(void, glTexCoord3dv, jobject v) {
	glTexCoord3dv(BUFF(GLdouble, v));
}

M(void, glTexCoord3fv, jobject v) {
	glTexCoord3fv(BUFF(GLfloat, v));
}

M(void, glTexCoord3iv, jobject v) {
	glTexCoord3iv(BUFF(GLint, v));
}

M(void, glTexCoord3sv, jobject v) {
	glTexCoord3sv(BUFF(GLshort, v));
}

M(void, glTexCoord4dv, jobject v) {
	glTexCoord4dv(BUFF(GLdouble, v));
}

M(void, glTexCoord4fv, jobject v) {
	glTexCoord4fv(BUFF(GLfloat, v));
}

M(void, glTexCoord4iv, jobject v) {
	glTexCoord4iv(BUFF(GLint, v));
}

M(void, glTexCoord4sv, jobject v) {
	glTexCoord4sv(BUFF(GLshort, v));
}

M(void, glRasterPos2d, jdouble x, jdouble y) {
	glRasterPos2d(x, y);
}

M(void, glRasterPos2f, jfloat x, jfloat y) {
	glRasterPos2f(x, y);
}

M(void, glRasterPos2i, jint x, jint y) {
	glRasterPos2i(x, y);
}

M(void, glRasterPos2s, jshort x, jshort y) {
	glRasterPos2s(x, y);
}

M(void, glRasterPos3d, jdouble x, jdouble y, jdouble z) {
	glRasterPos3d(x, y, z);
}

M(void, glRasterPos3f, jfloat x, jfloat y, jfloat z) {
	glRasterPos3f(x, y, z);
}

M(void, glRasterPos3i, jint x, jint y, jint z) {
	glRasterPos3i(x, y, z);
}

M(void, glRasterPos3s, jshort x, jshort y, jshort z) {
	glRasterPos3s(x, y, z);
}

M(void, glRasterPos4d, jdouble x, jdouble y, jdouble z, jdouble w) {
	glRasterPos4d(x, y, z, w);
}

M(void, glRasterPos4f, jfloat x, jfloat y, jfloat z, jfloat w) {
	glRasterPos4f(x, y, z, w);
}

M(void, glRasterPos4i, jint x, jint y, jint z, jint w) {
	glRasterPos4i(x, y, z, w);
}

M(void, glRasterPos4s, jshort x, jshort y, jshort z, jshort w) {
	glRasterPos4s(x, y, z, w);
}

M(void, glRasterPos2dv, jobject v) {
	glRasterPos2dv(BUFF(GLdouble, v));
}

M(void, glRasterPos2fv, jobject v) {
	glRasterPos2fv(BUFF(GLfloat, v));
}

M(void, glRasterPos2iv, jobject v) {
	glRasterPos2iv(BUFF(GLint, v));
}

M(void, glRasterPos2sv, jobject v) {
	glRasterPos2sv(BUFF(GLshort, v));
}

M(void, glRasterPos3dv, jobject v) {
	glRasterPos3dv(BUFF(GLdouble, v));
}

M(void, glRasterPos3fv, jobject v) {
	glRasterPos3fv(BUFF(GLfloat, v));
}

M(void, glRasterPos3iv, jobject v) {
	glRasterPos3iv(BUFF(GLint, v));
}

M(void, glRasterPos3sv, jobject v) {
	glRasterPos3sv(BUFF(GLshort, v));
}

M(void, glRasterPos4dv, jobject v) {
	glRasterPos4dv(BUFF(GLdouble, v));
}

M(void, glRasterPos4fv, jobject v) {
	glRasterPos4fv(BUFF(GLfloat, v));
}

M(void, glRasterPos4iv, jobject v) {
	glRasterPos4iv(BUFF(GLint, v));
}

M(void, glRasterPos4sv, jobject v) {
	glRasterPos4sv(BUFF(GLshort, v));
}

M(void, glRectd, jdouble x1, jdouble y1, jdouble x2, jdouble y2) {
	glRectd(x1, y1, x2, y2);
}

M(void, glRectf, jfloat x1, jfloat y1, jfloat x2, jfloat y2) {
	glRectf(x1, y1, x2, y2);
}

M(void, glRecti, jint x1, jint y1, jint x2, jint y2) {
	glRecti(x1, y1, x2, y2);
}

M(void, glRects, jshort x1, jshort y1, jshort x2, jshort y2) {
	glRects(x1, y1, x2, y2);
}

M(void, glRectdv, jobject v1, jobject v2) {
	glRectdv(BUFF(GLdouble, v1), BUFF(GLdouble, v2));
}

M(void, glRectfv, jobject v1, jobject v2) {
	glRectfv(BUFF(GLfloat, v1), BUFF(GLfloat, v2));
}

M(void, glRectiv, jobject v1, jobject v2) {
	glRectiv(BUFF(GLint, v1), BUFF(GLint, v2));
}

M(void, glRectsv, jobject v1, jobject v2) {
	glRectsv(BUFF(GLshort, v1), BUFF(GLshort, v2));
}

M(void, glShadeModel, jint mode) {
	glShadeModel(mode);
}

M(void, glLightf, jint light, jint pname, jfloat param) {
	glLightf(light, pname, param);
}

M(void, glLighti, jint light, jint pname, jint param) {
	glLightf(light, pname, param);
}

M(void, glLightfv, jint light, jint pname, jobject params) {
	glLightfv(light, pname, BUFF(GLfloat, params));
}

M(void, glLightiv, jint light, jint pname, jobject params) {
	glLightiv(light, pname, BUFF(GLint, params));
}

M(void, glGetLightfv, jint light, jint pname, jobject params) {
	glGetLightfv(light, pname, BUFF(GLfloat, params));
}

M(void, glGetLightiv, jint light, jint pname, jobject params) {
	glGetLightiv(light, pname, BUFF(GLint, params));
}

M(void, glLightModelf, jint pname, jfloat param) {
	glLightModelf(pname, param);
}

M(void, glLightModeli, jint pname, jint param) {
	glLightModeli(pname, param);
}

M(void, glLightModelfv, jint pname, jobject params) {
	glLightModelfv(pname, BUFF(GLfloat, params));
}

M(void, glLightModeliv, jint pname, jobject params) {
	glLightModeliv(pname, BUFF(GLint, params));
}

M(void, glMaterialf, jint face, jint pname, jfloat param) {
	glMaterialf(face, pname, param);
}

M(void, glMateriali, jint face, jint pname, jint param) {
	glMateriali(face, pname, param);
}

M(void, glMaterialfv, jint face, jint pname, jobject params) {
	glMaterialfv(face, pname, BUFF(GLfloat, params));
}

M(void, glMaterialiv, jint face, jint pname, jobject params) {
	glMaterialiv(face, pname, BUFF(GLint, params));
}

M(void, glGetMaterialfv, jint face, jint pname, jobject params) {
	glMaterialiv(face, pname, BUFF(GLint, params));
}

M(void, glGetMaterialiv, jint face, jint pname, jobject params) {
	glGetMaterialiv(face, pname, BUFF(GLint, params));
}

M(void, glColorMaterial, jint face, jint mode) {
	glColorMaterial(face, mode);
}

M(void, glPixelZoom, jfloat xfactor, jfloat yfactor) {
	glPixelZoom(xfactor, yfactor);
}

M(void, glPixelStoref, jint pname, jfloat param) {
	glPixelStoref(pname, param);
}

M(void, glPixelStorei, jint pname, jint param) {
	glPixelStorei(pname, param);
}

M(void, glPixelTransferf, jint pname, jfloat param) {
	glPixelTransferf(pname, param);
}

M(void, glPixelTransferi, jint pname, jint param) {
	glPixelTransferi(pname, param);
}

M(void, glPixelMapfv, jint map, jint mapsize, jobject values) {
	glPixelMapfv(map, mapsize, BUFF(GLfloat, values));
}

M(void, glPixelMapuiv, jint map, jint mapsize, jobject values) {
	glPixelMapuiv(map, mapsize, BUFF(GLuint, values));
}

M(void, glPixelMapusv, jint map, jint mapsize, jobject values) {
	glPixelMapusv(map, mapsize, BUFF(GLushort, values));
}

M(void, glGetPixelMapfv, jint map, jobject values) {
	glGetPixelMapfv(map, BUFF(GLfloat, values));
}

M(void, glGetPixelMapuiv, jint map, jobject values) {
	glGetPixelMapuiv(map, BUFF(GLuint, values));
}

M(void, glGetPixelMapusv, jint map, jobject values) {
	glGetPixelMapusv(map, BUFF(GLushort, values));
}

M(void, glBitmap, jint width, jint height, jfloat xorig, jfloat yorig, jfloat xmove, jfloat ymove, jobject bitmap) {
	glBitmap(width, height, xorig, yorig, xmove, ymove, BUFF(GLubyte, bitmap));
}

M(void, glReadPixels, jint x, jint y, jint width, jint height, jint format, jint type, jobject pixels) {
	glReadPixels(x, y, width, height, format, type, BUFF(GLvoid, pixels));
}

M(void, glDrawPixels, jint width, jint height, jint format, jint type, jobject pixels) {
	glDrawPixels(width, height, format, type, BUFF(GLvoid, pixels));
}

M(void, glCopyPixels, jint x, jint y, jint width, jint height, jint type) {
	glCopyPixels(x, y, width, height, type);
}

M(void, glStencilFunc, jint func, jint ref, jint mask) {
	glStencilFunc(func, ref, mask);
}

M(void, glStencilMask, jint mask) {
	glStencilMask(mask);
}

M(void, glStencilOp, jint fail, jint zfail, jint zpass) {
	glStencilOp(fail, zfail, zpass);
}

M(void, glClearStencil, jint s) {
	glClearStencil(s);
}

M(void, glTexGend, jint coord, jint pname, jdouble param) {
	glTexGend(coord, pname, param);
}

M(void, glTexGenf, jint coord, jint pname, jfloat param) {
	glTexGenf(coord, pname, param);
}

M(void, glTexGeni, jint coord, jint pname, jint param) {
	glTexGeni(coord, pname, param);
}

M(void, glTexGendv, jint coord, jint pname, jobject params) {
	glTexGendv(coord, pname, BUFF(GLdouble, params));
}

M(void, glTexGenfv, jint coord, jint pname, jobject params) {
	glTexGenfv(coord, pname, BUFF(GLfloat, params));
}

M(void, glTexGeniv, jint coord, jint pname, jobject params) {
	glTexGeniv(coord, pname, BUFF(GLint, params));
}

M(void, glGetTexGendv, jint coord, jint pname, jobject params) {
	glGetTexGendv(coord, pname, BUFF(GLdouble, params));
}

M(void, glGetTexGenfv, jint coord, jint pname, jobject params) {
	glGetTexGenfv(coord, pname, BUFF(GLfloat, params));
}

M(void, glGetTexGeniv, jint coord, jint pname, jobject params) {
	glGetTexGeniv(coord, pname, BUFF(GLint, params));
}

M(void, glTexEnvf, jint target, jint pname, jfloat param) {
	glTexEnvf(target, pname, param);
}

M(void, glTexEnvi, jint target, jint pname, jint param) {
	glTexEnvi(target, pname, param);
}

M(void, glTexEnvfv, jint target, jint pname, jobject params) {
	glTexEnvfv(target, pname, BUFF(GLfloat, params));
}

M(void, glTexEnviv, jint target, jint pname, jobject params) {
	glTexEnviv(target, pname, BUFF(GLint, params));
}

M(void, glGetTexEnvfv, jint target, jint pname, jobject params) {
	glGetTexEnvfv(target, pname, BUFF(GLfloat, params));
}

M(void, glGetTexEnviv, jint target, jint pname, jobject params) {
	glGetTexEnviv(target, pname, BUFF(GLint, params));
}

M(void, glTexParameterf, jint target, jint pname, jfloat param) {
	glTexParameterf(target, pname, param);
}

M(void, glTexParameteri, jint target, jint pname, jint param) {
	glTexParameteri(target, pname, param);
}

M(void, glTexParameterfv, jint target, jint pname, jobject params) {
	glTexParameterfv(target, pname, BUFF(GLfloat, params));
}

M(void, glTexParameteriv, jint target, jint pname, jobject params) {
	glTexParameteriv(target, pname, BUFF(GLint, params));
}

M(void, glGetTexParameterfv, jint target, jint pname, jobject params) {
	glGetTexParameterfv(target, pname, BUFF(GLfloat, params));
}

M(void, glGetTexParameteriv, jint target, jint pname, jobject params) {
	glGetTexParameteriv(target, pname, BUFF(GLint, params));
}

M(void, glGetTexLevelParameterfv, jint target, jint level, jint pname, jobject params) {
	glGetTexLevelParameterfv(target, level, pname, BUFF(GLfloat, params));
}

M(void, glGetTexLevelParameteriv, jint target, jint level, jint pname, jobject params) {
	glGetTexLevelParameteriv(target, level, pname, BUFF(GLint, params));
}

M(void, glTexImage1D, jint target, jint level, jint internalFormat, jint width, jint border, jint format, jint type, jobject pixels) {
	glTexImage1D(target, level, internalFormat, width, border, format, type, BUFF(GLvoid, pixels));
}

M(void, glTexImage2D, jint target, jint level, jint internalFormat, jint width, jint height, jint border, jint format, jint type, jobject pixels) {
	glTexImage2D(target, level, internalFormat, width, height, border, format, type, BUFF(GLvoid, pixels));
}

M(void, glGetTexImage, jint target, jint level, jint format, jint type, jobject pixels) {
	glGetTexImage(target, level, format, type, BUFF(GLvoid, pixels));
}

M(void, glMap1d, jint target, jdouble u1, jdouble u2, jint stride, jint order, jobject points) {
	glMap1d(target, u1, u2, stride, order, BUFF(GLdouble, points));
}

M(void, glMap1f, jint target, jfloat u1, jfloat u2, jint stride, jint order, jobject points) {
	glMap1f(target, u1, u2, stride, order, BUFF(GLfloat, points));
}

M(void, glMap2d, jint target, jdouble u1, jdouble u2, jint ustride, jint uorder, jdouble v1, jdouble v2, jint vstride, jint vorder, jobject points) {
	glMap2d(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, BUFF(GLdouble, points));
}

M(void, glMap2f, jint target, jfloat u1, jfloat u2, jint ustride, jint uorder, jfloat v1, jfloat v2, jint vstride, jint vorder, jobject points) {
	glMap2f(target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, BUFF(GLfloat, points));
}

M(void, glGetMapdv, jint target, jint query, jobject v) {
	glGetMapdv(target, query, BUFF(GLdouble, v));
}

M(void, glGetMapfv, jint target, jint query, jobject v) {
	glGetMapfv(target, query, BUFF(GLfloat, v));
}

M(void, glGetMapiv, jint target, jint query, jobject v) {
	glGetMapiv(target, query, BUFF(GLint, v));
}

M(void, glEvalCoord1d, jdouble u) {
	glEvalCoord1d(u);
}

M(void, glEvalCoord1f, jfloat u) {
	glEvalCoord1f(u);
}

M(void, glEvalCoord1dv, jobject u) {
	glEvalCoord1dv(BUFF(GLdouble, u));
}

M(void, glEvalCoord1fv, jobject u) {
	glEvalCoord1fv(BUFF(GLfloat, u));
}

M(void, glEvalCoord2d, jdouble u, jdouble v) {
	glEvalCoord2d(u, v);
}

M(void, glEvalCoord2f, jfloat u, jfloat v) {
	glEvalCoord2f(u, v);
}

M(void, glEvalCoord2dv, jobject u) {
	glEvalCoord2dv(BUFF(GLdouble, u));
}

M(void, glEvalCoord2fv, jobject u) {
	glEvalCoord2fv(BUFF(GLfloat, u));
}

M(void, glMapGrid1d, jint un, jdouble u1, jdouble u2) {
	glMapGrid1d(un, u1, u2);
}

M(void, glMapGrid1f, jint un, jfloat u1, jfloat u2) {
	glMapGrid1f(un, u1, u2);
}

M(void, glMapGrid2d, jint un, jdouble u1, jdouble u2, jint vn, jdouble v1, jdouble v2) {
	glMapGrid2d(un, u1, u2, vn, v1, v2);
}

M(void, glMapGrid2f, jint un, jfloat u1, jfloat u2, jint vn, jfloat v1, jfloat v2) {
	glMapGrid2f(un, u1, u2, vn, v1, v2);
}

M(void, glEvalPoint1, jint i) {
	glEvalPoint1(i);
}

M(void, glEvalPoint2, jint i, jint j) {
	glEvalPoint2(i, j);
}

M(void, glEvalMesh1, jint mode, jint i1, jint i2) {
	glEvalMesh1(mode, i1, i2);
}

M(void, glEvalMesh2, jint mode, jint i1, jint i2, jint j1, jint j2) {
	glEvalMesh2(mode, i1, i2, j1, j2);
}

M(void, glFogf, jint pname, jfloat param) {
	glFogf(pname, param);
}

M(void, glFogi, jint pname, jint param) {
	glFogi(pname, param);
}

M(void, glFogfv, jint pname, jobject params) {
	glFogfv(pname, BUFF(GLfloat, params));
}

M(void, glFogiv, jint pname, jobject params) {
	glFogiv(pname, BUFF(GLint, params));
}

M(void, glFeedbackBuffer, jint size, jint type, jobject buffer) {
	glFeedbackBuffer(size, type, BUFF(GLfloat, buffer));
}

M(void, glPassThrough, jfloat token) {
	glPassThrough(token);
}

M(void, glSelectBuffer, jint size, jobject buffer) {
	glSelectBuffer(size, BUFF(GLuint, buffer));
}

M(void, glInitNames) {
	glInitNames();
}

M(void, glLoadName, jint name) {
	glLoadName(name);
}

M(void, glPushName, jint name) {
	glPushName(name);
}

M(void, glPopName) {
	glPopName();
}

M(void, glGenTextures, jint n, jobject textures) {
	glGenTextures(n, BUFF(GLuint, textures));
}

M(void, glDeleteTextures, jint n, jobject textures) {
	glDeleteTextures(n, BUFF(GLuint, textures));
}

M(void, glBindTexture, jint target, jint texture) {
	glBindTexture(target, texture);
}

M(void, glPrioritizeTextures, jint n, jobject textures, jobject priorities) {
	glPrioritizeTextures(n, BUFF(GLuint, textures), BUFF(GLfloat, priorities));
}

M(jboolean, glAreTexturesResident, jint n, jobject textures, jobject residences) {
	return glAreTexturesResident(n, BUFF(GLuint, textures), BUFF(GLboolean, residences));
}

M(jboolean, glIsTexture, jint texture) {
	return glIsTexture(texture);
}

M(void, glTexSubImage1D, jint target, jint level, jint xoffset, jint width, jint format, jint type, jobject pixels) {
	glTexSubImage1D(target, level, xoffset, width, format, type, BUFF(GLvoid, pixels));
}

M(void, glTexSubImage2D, jint target, jint level, jint xoffset, jint yoffset, jint width, jint height, jint format, jint type, jobject pixels){
	glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, BUFF(GLvoid, pixels));
}

M(void, glCopyTexImage1D, jint target, jint level, jint internalformat, jint x, jint y, jint width, jint border) {
	glCopyTexImage1D(target, level, internalformat, x, y, width, border);
}

M(void, glCopyTexImage2D, jint target, jint level, jint internalformat, jint x, jint y, jint width, jint height, jint border) {
	glCopyTexImage2D(target, level, internalformat, x, y, width, height, border);
}

M(void, glCopyTexSubImage1D, jint target, jint level, jint xoffset, jint x, jint y, jint width) {
	glCopyTexSubImage1D(target, level, xoffset, x, y, width);
}

M(void, glCopyTexSubImage2D, jint target, jint level, jint xoffset, jint yoffset, jint x, jint y, jint width, jint height) {
	glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
}

M(void, glVertexPointer, jint size, jint type, jint stride, jobject ptr) {
	glVertexPointer(size, type, stride, BUFF(GLvoid, ptr));
}

M(void, glNormalPointer, jint type, jint stride, jobject ptr) {
	glNormalPointer(type, stride, BUFF(GLvoid, ptr));
}

M(void, glColorPointer, jint size, jint type, jint stride, jobject ptr) {
	glColorPointer(size, type, stride, BUFF(GLvoid, ptr));
}

M(void, glIndexPointer, jint type, jint stride, jobject ptr) {
	glIndexPointer(type, stride, BUFF(GLvoid, ptr));
}

M(void, glTexCoordPointer, jint size, jint type, jint stride, jobject ptr) {
	glTexCoordPointer(size, type, stride, BUFF(GLvoid, ptr));
}

M(void, glEdgeFlagPointer, jint stride, jobject ptr) {
	glEdgeFlagPointer(stride, BUFF(GLvoid, ptr));
}

M(void, glGetPointerv, jint pname, jobject params) {
	glGetPointerv(pname, BUFF(GLvoid *, params));
}

M(void, glArrayElement, jint i) {
	glArrayElement(i);
}

M(void, glDrawArrays, jint mode, jint first, jint count) {
	glDrawArrays(mode, first, count);
}

M(void, glDrawElements, jint mode, jint count, jint type, jobject indices) {
	glDrawElements(mode, count, type, BUFF(GLvoid, indices));
}

M(void, glInterleavedArrays, jint format, jint stride, jobject pointer) {
	glInterleavedArrays(format, stride, BUFF(GLvoid, pointer));
}
