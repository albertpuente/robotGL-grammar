TARGET 	= robotGL

# Directoris
ROOT = $(PWD)
SRCDIR = $(ROOT)/src
LIBDIR = $(ROOT)/libs

EXEC = $(ROOT)/$(TARGET)

#CFLAGS = -O2 -pthread -std=c++11
CFLAGS = -O2 -pthread -std=c++0x -fpermissive
CC = g++ 
FLAGS 	= -lGL -lglut -lGLU -lGLEW -w

LIB_FILES =	$(LIBDIR)/*.c

SRC_FILES = 	$(SRCDIR)/*.cpp

SRCS = $(SRC_FILES) $(LIB_FILES)

all: 	
	$(CC) $(CFLAGS) $(SRCS) -o $(TARGET) -I$(LIBDIR) $(FLAGS)
