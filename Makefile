# Target file
TARGET = CarDealership

# Java compiler options
JC = javac
JFLAGS = -g

# Project dirs
SRC = src
DOCS = docs

# Java files
JFILES = $(wildcard $(SRC)/*.java)
CLASSES = $(JFILES:.java=.class)

# Helpers.
RM = rm $(SRC)/*.class
RUN = cd $(SRC) && java $(TARGET)

all: $(CLASSES)
	$(JC) $(JFLAGS) $(JFILES)
	$(RUN)

%.class: %.java
	$(JC) $<

clean:
	$(RM)