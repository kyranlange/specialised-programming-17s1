/**
 * Created by a1132199 on 15/03/17.
 */
class VolumeGuess {

    int correctVolume(String[] queries, int numberOfBoxes, int ithBox) {
        // Get list of queries
        List<Query> queryList = []
        for (String q : queries) {
            String[] tmp = q.split(",")
            Query qu = new Query(box1: tmp[0].toInteger(), box2: tmp[1].toInteger(), smaller: tmp[2].toInteger())
            if (qu.box1 == ithBox || qu.box2 == ithBox) {
                queryList.add(qu)
            }
        }

        queryList.sort{it.smaller}.reverse(true) //sort largest first

        queryList.get(0).smaller
    }


    private class Query {
        int box1,box2,smaller
    }

}
