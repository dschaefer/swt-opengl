/*
 * glerror.h
 *
 *  Created on: Sep 18, 2010
 *      Author: dschaefer
 */

#ifndef GLERROR_H_
#define GLERROR_H_

// Function that is bound when a proc can not be found
void swtGLNotImplemented();

// Made visible so good methods can clear this
extern GLenum swtGLError;

#endif /* GLERROR_H_ */
