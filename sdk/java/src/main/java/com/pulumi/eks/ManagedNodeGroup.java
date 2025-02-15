// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.eks;

import com.pulumi.aws.eks.NodeGroup;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.eks.ManagedNodeGroupArgs;
import com.pulumi.eks.Utilities;
import javax.annotation.Nullable;

/**
 * ManagedNodeGroup is a component that wraps creating an AWS managed node group.
 * 
 * See for more details:
 * https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html
 * 
 */
@ResourceType(type="eks:index:ManagedNodeGroup")
public class ManagedNodeGroup extends com.pulumi.resources.ComponentResource {
    /**
     * The AWS managed node group.
     * 
     */
    @Export(name="nodeGroup", type=NodeGroup.class, parameters={})
    private Output<NodeGroup> nodeGroup;

    /**
     * @return The AWS managed node group.
     * 
     */
    public Output<NodeGroup> nodeGroup() {
        return this.nodeGroup;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedNodeGroup(String name) {
        this(name, ManagedNodeGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedNodeGroup(String name, ManagedNodeGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedNodeGroup(String name, ManagedNodeGroupArgs args, @Nullable com.pulumi.resources.ComponentResourceOptions options) {
        super("eks:index:ManagedNodeGroup", name, args == null ? ManagedNodeGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()), true);
    }

    private static com.pulumi.resources.ComponentResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.ComponentResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.ComponentResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.ComponentResourceOptions.merge(defaultOptions, options, id);
    }

}
