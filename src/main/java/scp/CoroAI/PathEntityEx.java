package scp.CoroAI;

import net.minecraft.entity.Entity;
import net.minecraft.util.Vec3;

public class PathEntityEx/* extends PathEntity*/
{
    public final PathPointEx points[];
    public final int pathLength;
    public int pathIndex;

    public PathEntityEx(PathPointEx apathpoint[])
    {
        points = apathpoint;
        pathLength = apathpoint.length;
    }

    public void incrementPathIndex()
    {
        pathIndex++;
    }

    public boolean isFinished()
    {
        return pathIndex >= points.length;
    }

    public Vec3 getPosition(Entity entity)
    {
    	try {
	        double d = (double)points[pathIndex].xCoord + (double)(int)(entity.width + 1.0F) * 0.5D;
	        double d1 = points[pathIndex].yCoord;
	        double d2 = (double)points[pathIndex].zCoord + (double)(int)(entity.width + 1.0F) * 0.5D;
	        return Vec3.createVectorHelper(d, d1, d2);
    	} catch (Exception ex) { 
    		return null;//thread crash
    	}
    }
}
