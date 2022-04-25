
def ReplaceJson(filename,to_replace,new_word,suffix):
    try:
        in_file = open (filename + ".json", "rt")
        print("File opened")
        out_file = open(filename.replace(filename,new_word+".json"),"wt")
        for line in in_file:
            out_file.write(line.replace(to_replace,new_word))
        in_file.close()
        out_file.close()
    except IOError:
        print("Could not find file!")



woodVariants = ["spruce_planks","birch_planks","jungle_planks","acacia_planks"\
                ,"dark_oak_planks","crimson_planks","warped_planks"]


for wood in woodVariants:
    ReplaceJson("oak_steps","oak_steps",wood+"_steps","_steps")

    


