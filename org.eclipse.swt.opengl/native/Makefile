TARGET = swt-opengl.dll

OBJS = gl.o
CXXFLAGS = -I /mingw/include/GL

all:	$(TARGET)

$(TARGET):	$(OBJS)
	g++ -shared -o swt-opengl.dll $(OBJS)
