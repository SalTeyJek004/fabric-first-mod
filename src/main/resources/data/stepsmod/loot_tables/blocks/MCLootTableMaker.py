
def ReplaceJson(filename,to_replace,new_word):
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

stoneVariants = ["stone","granite","polished_granite","diorite","polished_diorite"\
    ,"andesite","polished_andesite","mossy_cobblestone","stone_brick","mossy_stone_brick"]


for stone in stoneVariants:
    ReplaceJson("cobblestone_steps","cobblestone_steps",stone+"_steps")

    


