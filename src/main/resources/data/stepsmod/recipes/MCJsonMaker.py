
def ReplaceJson(filename,to_replace,new_word,suffix):
    try:
        in_file = open (filename + ".json", "rt")
        print("File opened")
        out_file = open(filename.replace(filename,new_word+suffix+".json"),"wt")
        for line in in_file:
            temp = line.replace(to_replace,new_word)
            temp = temp.replace("_planks_planks","_planks")
            out_file.write(temp)
        in_file.close()
        out_file.close()
    except IOError:
        print("Could not find file!")



woodVariants = ["spruce_planks","birch_planks","jungle_planks","acacia_planks"\
                ,"dark_oak_planks","crimson_planks","warped_planks"]


for wood in woodVariants:
    ReplaceJson("oak_steps","oak",wood,"_steps")

    


