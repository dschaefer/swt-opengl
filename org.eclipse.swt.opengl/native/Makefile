TARGET = ../os/win32/x86/swt-opengl.dll

OBJS = gl.o
LIBS = -lopengl32

all:	$(TARGET)

$(TARGET):	$(OBJS)
	@[ -d $(dir $(TARGET)) ] || mkdir -p $(dir $(TARGET))
	g++ -shared -Wl,--kill-at -o $(TARGET) $(OBJS) $(LIBS)
